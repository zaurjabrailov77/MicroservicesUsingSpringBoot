package az.com.developer.departmentservice.controller;

import az.com.developer.departmentservice.domain.dto.DepartmentDto;
import az.com.developer.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> findAll() {
        return ResponseEntity.ok(departmentService.findAll());
    }

    @PostMapping
    public ResponseEntity<DepartmentDto> save(@RequestBody DepartmentDto departmentDto) {
        log.info("Inside save Department method of DepartmentController");
        departmentService.save(departmentDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentDto);

    }

}
