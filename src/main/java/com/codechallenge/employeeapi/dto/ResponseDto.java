package com.codechallenge.employeeapi.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseDto<T> {
    private HttpStatus statusCode;
    private T body;

    private ResponseDto() {}

    public static <T> Builder<T> builder() {
        return new Builder<>();
    }

    public static class Builder<T> {
        private HttpStatus statusCode;
        private T body;

        private Builder() {
            this.statusCode = HttpStatus.OK;
        }

        public Builder<T> statusCode(HttpStatus statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder<T> body(T body) {
            this.body = body;
            return this;
        }

        public ResponseDto<T> build() {
            ResponseDto<T> responseDto = new ResponseDto<>();
            responseDto.setStatusCode(statusCode);
            responseDto.setBody(body);
            return responseDto;
        }
    }
}
