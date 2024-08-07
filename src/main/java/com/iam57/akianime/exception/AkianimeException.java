package com.iam57.akianime.exception;

import com.iam57.akianime.common.enums.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;

/**
 * @author iam57
 * @since 2024/6/28 14:23
 */
@Getter
@AllArgsConstructor
public class AkianimeException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1527899109561253925L;
    private CodeEnum codeEnum;
}
