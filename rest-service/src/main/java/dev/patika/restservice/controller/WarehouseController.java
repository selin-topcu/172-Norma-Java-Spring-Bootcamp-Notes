package dev.patika.restservice.controller;

import dev.patika.restservice.model.WarehouseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api")
@Slf4j
public class WarehouseController {


    @PostMapping(path="/warehouses")
    //RequestBody bunun model olduğunu algılaması için verilir
    public ResponseEntity<?> createWarehouse(@RequestBody WarehouseModel warehouseModel){
        log.info("{}",warehouseModel);
        log.info("Warehouse created",warehouseModel);
        throw new NullPointerException();
//        return ResponseEntity.ok().build();
    }

    @GetMapping(path="/warehouses")
    //RequestBody bunun model olduğunu algılaması için verilir
    public ResponseEntity<?> getWarehouse(@RequestBody WarehouseModel warehouseModel){
        log.info("{}",warehouseModel);
        log.info("Warehouse fetched",warehouseModel);

        //
        return ResponseEntity.ok().body(
                WarehouseModel
                        .of()
                        .id(1)
                        .name("Ankara")
                        .address("KAzan")
                        .type(WarehouseModel.WarehouseType.COLD)
                        .build()
        );
    }

    @GetMapping(path="/warehouses/{id:[\\d+]}")
    //API daki değişikleiklrei bind edevilmek için gerekli pathvariable
    public ResponseEntity<?> getWarehouse(@PathVariable Integer id){
        log.info("Warehouse {} fetched",id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path="/warehouses/search")
    public ResponseEntity<?> search(@RequestParam("id") Integer id,
                                    @RequestParam("type") String type,
                                    @RequestParam(value="name", required=false) String name
                                    ){
        log.info("ID> {}, TYPE> {}, NAME> {}",id,type,name);
        throw new NullPointerException("Search yaparken hata oluştu");

//        return ResponseEntity.ok().build();
    }

    @PutMapping(path="/warehouses/{id:[\\d+]}")
    public ResponseEntity<?> updateWarehouse(@PathVariable Integer id,
                                             @RequestBody WarehouseModel warehouseModel){
        log.info("Warehouse id> {} with {} updated",id,warehouseModel);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path="/warehouses/{id:[\\d+]}")
    public ResponseEntity<?> deleteWarehouse(@PathVariable Integer id){
        log.info("Warehouse id> {} deleted",id);
        return ResponseEntity.ok().build();
    }
}
