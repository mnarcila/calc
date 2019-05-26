package io.swagger.api;

import io.swagger.model.Resultado;
import io.swagger.model.Mult;
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
public class MulApiController implements MulApi {

	public ResponseEntity<Resultado> mul(

			@ApiParam(value = "") @RequestBody Mult resta

	) {
		Resultado rest = new Resultado();

		rest.setResult(resta.getNum1() * resta.getNum2());
		return ResponseEntity.ok(rest);
		 
	}

}
