package com.tyron.builder.api.internal.tasks.properties.annotations;

import static com.tyron.builder.api.internal.tasks.properties.ModifierAnnotationCategory.*;

import com.google.common.collect.ImmutableSet;
import com.tyron.builder.api.internal.reflect.AnnotationCategory;
import com.tyron.builder.api.internal.tasks.properties.InputFilePropertyType;
import com.tyron.builder.api.tasks.InputFile;

import java.lang.annotation.Annotation;

public class InputFilePropertyAnnotationHandler extends AbstractInputFilePropertyAnnotationHandler {
    @Override
    public Class<? extends Annotation> getAnnotationType() {
        return InputFile.class;
    }

    @Override
    public ImmutableSet<? extends AnnotationCategory> getAllowedModifiers() {
        return ImmutableSet.of(INCREMENTAL, NORMALIZATION, OPTIONAL, NORMALIZE_LINE_ENDINGS);
    }

    @Override
    protected InputFilePropertyType getFilePropertyType() {
        return InputFilePropertyType.FILE;
    }
}