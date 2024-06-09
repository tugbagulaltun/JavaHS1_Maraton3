package com.tugba.controller;

import com.tugba.dto.request.MarkaSaveRequestDto;
import com.tugba.entity.Marka;
import com.tugba.service.MarkaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.tugba.config.RestApis.*;

@RestController
@AllArgsConstructor
@RequestMapping(MARKA)
public class MarkaController {
    private final MarkaService markaService;

    @PostMapping("/save")
    public ResponseEntity<Marka> save(@Valid @RequestBody MarkaSaveRequestDto dto){
        return ResponseEntity.ok(markaService.save(dto));
    }

}
