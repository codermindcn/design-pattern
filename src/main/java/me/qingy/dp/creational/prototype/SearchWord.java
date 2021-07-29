package me.qingy.dp.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author qingy
 * @since 2021-07-29
 */
@Data
@AllArgsConstructor
public class SearchWord {
    private String keyword;
    private Long count;
    private Long lastUpdateTime;
}
