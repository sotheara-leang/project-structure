package com.example.structure.base.exception;

import com.example.structure.base.util.Translatable;

public interface ErrorCode<T extends Enum<?>> extends Translatable {

	T getCode();
}
