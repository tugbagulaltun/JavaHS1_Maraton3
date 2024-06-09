package com.tugba.controller;


import com.tugba.dto.request.ModelSaveRequestDto;
import com.tugba.entity.Model;
import com.tugba.service.ModelService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  static com.tugba.config.RestApis.*;


@RestController
@AllArgsConstructor
@RequestMapping(MODEL)
public class ModelController {
    private final ModelService modelService;

    @PostMapping("/save")
    public ResponseEntity<Model> save(@Valid @RequestBody ModelSaveRequestDto dto){
        return ResponseEntity.ok(modelService.save(dto));
    }
}
