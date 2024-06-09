package com.tugba.controller;
import com.tugba.dto.request.UrunOzellikSaveRequestDto;

import com.tugba.entity.UrunOzellik;
import com.tugba.service.UrunOzellikService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



import static com.tugba.config.RestApis.*;

@RestController
@AllArgsConstructor
@RequestMapping(URUNOZELLIK)
public class UrunOzellikController {
    private final UrunOzellikService urunOzellikService;

    @PostMapping("/save")
    public ResponseEntity<UrunOzellik> save(@Valid @RequestBody UrunOzellikSaveRequestDto dto){
        return ResponseEntity.ok(urunOzellikService.save(dto));
    }


}
