/*
 * Copyright 2015 Piotr Buda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.piotrbuda.intellij.pony.jps;

import me.piotrbuda.intellij.pony.jps.model.JpsPonyModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildOutputConsumer;
import org.jetbrains.jps.builders.DirtyFilesHolder;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.ProjectBuildException;
import org.jetbrains.jps.incremental.TargetBuilder;
import org.jetbrains.jps.incremental.resources.ResourcesBuilder;
import org.jetbrains.jps.incremental.resources.StandardResourceBuilderEnabler;
import org.jetbrains.jps.model.module.JpsModule;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class PonyBuilder extends TargetBuilder<PonySourceRootDescriptor, PonyTarget> {

    public PonyBuilder() {
        super(Arrays.asList(PonyTargetType.PRODUCTION, PonyTargetType.TESTS));
        ResourcesBuilder.registerEnabler(new StandardResourceBuilderEnabler() {
            @Override
            public boolean isResourceProcessingEnabled(@NotNull JpsModule module) {
                return !(module.getModuleType() instanceof JpsPonyModuleType);
            }
        });
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Pony builder";
    }

    @Override
    public void build(@NotNull PonyTarget target,
                      @NotNull DirtyFilesHolder<PonySourceRootDescriptor, PonyTarget> dirtyFilesHolder,
                      @NotNull BuildOutputConsumer buildOutputConsumer,
                      @NotNull CompileContext compileContext) throws ProjectBuildException, IOException {
        runPony(target.getModule());
    }

    private void runPony(@NotNull final JpsModule module) throws ProjectBuildException {
        final String moduleRoot = module.getContentRootsList().getUrls().get(0).substring("file://".length());
        final PonyJspInterface pony = new PonyJspInterface(new File(moduleRoot + "/main.pony"));
        pony.runBuild();
    }
}
