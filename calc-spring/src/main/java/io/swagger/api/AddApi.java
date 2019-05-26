package io.swagger.api;

import io.swagger.model.Resultado;
import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-25T23:44:22.900-05:00")

@Api(value = "add", description = "the add API")
public interface AddApi {

    @ApiOperation(value = "Operacion de suma", notes = "", response = Resultado.class, tags={ "calc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Resultado.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Resultado.class) })
    @RequestMapping(value = "/add",
        produces = { "application/json" }, 
      
        method = RequestMethod.GET)
    ResponseEntity<Resultado> add(@ApiParam(value = "primer numero", required = true) @RequestParam(value = "num1", required = true) Integer num1



,@ApiParam(value = "segundo numero", required = true) @RequestParam(value = "num2", required = true) Integer num2



);

}
