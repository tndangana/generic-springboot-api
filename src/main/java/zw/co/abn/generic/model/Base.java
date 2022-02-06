package zw.co.abn.generic.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Base {
    @ApiModelProperty(readOnly = true)
    private String id;
    private LocalDate createdDate = LocalDate.now();
    private LocalDate updatedDate = LocalDate.now();
}
