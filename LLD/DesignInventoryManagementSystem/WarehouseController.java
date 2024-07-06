import java.util.List;

public class WarehouseController {

    List<Warehouse> warehouses;
    WarehouseSelectionStrategy warehouseSelectionStrategy = null;

    WarehouseController(List<Warehouse> warehouseList , WarehouseSelectionStrategy strategy) {
        this.warehouses = warehouseList;
        this.warehouseSelectionStrategy = strategy;
    }

    // add new warehouse.
    public void addNewWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    // remove warehouse
    public void removeWarehouse(Warehouse warehouse) {
        warehouses.remove(warehouse);
    }

    // selecting a warehouse based on the warehouse strategy.
    public Warehouse selectWarehouse(WarehouseSelectionStrategy selectionStrategy) {
        this.warehouseSelectionStrategy = selectionStrategy;
        return warehouseSelectionStrategy.selectWarehouse(warehouses);
    }
}
