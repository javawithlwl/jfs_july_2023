package com.careerit.iplstats.util;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppErrorResponse {

        private HttpStatus httpStatus;
        private String message;
}
