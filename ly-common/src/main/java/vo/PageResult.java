package vo;

import lombok.Data;

import java.util.List;
@Data
public class PageResult<T> {
    private Long pageTotal;
    private List<T> items;
    private Long total;

    public PageResult(Long total,List<T> items) {
        this.items = items;
        this.total = total;
    }

    public PageResult(Long pageTotal, List<T> items, Long total) {

        this.pageTotal = pageTotal;
        this.items = items;
        this.total = total;
    }

    public PageResult() {

    }
}
