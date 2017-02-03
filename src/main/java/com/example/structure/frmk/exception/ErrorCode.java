package com.example.structure.frmk.exception;

import com.example.structure.frmk.util.Translatable;

public interface ErrorCode<T extends Enum<?>> extends Translatable {

	T getCode();
}
