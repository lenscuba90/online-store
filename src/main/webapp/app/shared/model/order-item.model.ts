import { IProduct } from 'app/shared/model/product.model';
import { IProductOrder } from 'app/shared/model/product-order.model';
import { OrderItemStatus } from 'app/shared/model/enumerations/order-item-status.model';

export interface IOrderItem {
  id?: number;
  quantity?: number;
  status?: OrderItemStatus;
  product?: IProduct;
  order?: IProductOrder;
}

export class OrderItem implements IOrderItem {
  constructor(
    public id?: number,
    public quantity?: number,
    public status?: OrderItemStatus,
    public product?: IProduct,
    public order?: IProductOrder
  ) {}
}
