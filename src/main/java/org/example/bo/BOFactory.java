package org.example.bo;

import org.example.bo.custom.impl.CustomerBOImpl;
import org.example.bo.custom.impl.ItemBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){

    }

    public static BOFactory getBoFactory(){
        return (boFactory==null)? boFactory=new BOFactory() : boFactory;
    }
    public enum BOTypes{
        CUSTOMER,ITEM,PLACE_ORDER
    }

//    public SuperBO getBO(BOTypes types){
//        switch (types){
//            case CUSTOMER:
//                return (SuperBO) new CustomerBOImpl();
//            case ITEM:
//                return new ItemBOImpl();
//            default:
//                return null;
//        }
//    }


}
