package com.tugba.controller;

import com.tugba.dto.request.UrunSaveRequestDto;
import com.tugba.entity.Urun;
import com.tugba.entity.enums.Beden;
import com.tugba.entity.enums.Cinsiyet;
import com.tugba.service.UrunService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.tugba.config.RestApis.*;

@RestController
@AllArgsConstructor
@RequestMapping(URUN)
public class UrunController {
    private final UrunService urunService;

    @PostMapping("/save")
    public ResponseEntity<Urun> save(@Valid @RequestBody UrunSaveRequestDto dto){
        return ResponseEntity.ok(urunService.save(dto));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Urun>> getAll(){
        return ResponseEntity.ok(urunService.getAll());
    }
    @GetMapping("/find")
    public ResponseEntity<List<Urun>> find(String name){
        return ResponseEntity.ok(urunService.getAllUrunAdi(name));
    }

    @GetMapping("/getAllByCinsiyetAndBeden")
    public ResponseEntity<List<Urun>> getAllByCinsiyetAndBeden(@RequestParam Cinsiyet cinsiyet, @RequestParam Beden beden) {
        List<Urun> urunler = urunService.getAllByCinsiyetAndBeden(cinsiyet, beden);
        return ResponseEntity.ok(urunler);
    }
}
