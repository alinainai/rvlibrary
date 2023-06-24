package com.base.expended;

import com.base.paginate.interfaces.OnMultiItemClickListeners;

public interface OnItemExtendListener<T> extends OnMultiItemClickListeners<T> {

   default void itemRemoved(T data, int position){}

}
