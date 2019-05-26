package io.swagger.api;

import io.swagger.model.Resultado;
import io.swagger.model.Error;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-25T23:44:22.900-05:00")

@Controller
public class DivApiController implements DivApi {

    public ResponseEntity<Resultado> div(@ApiParam(value = "primer numero", required = true) @RequestParam(value = "num1", required = true) Integer num1



,
        @ApiParam(value = "segundo numero", required = true) @RequestParam(value = "num2", required = true) Integer num2



) {
    	Resultado rest = new Resultado();
    	
		rest.setResult(num1/num2);
        return  ResponseEntity.ok(rest);
    }

}
