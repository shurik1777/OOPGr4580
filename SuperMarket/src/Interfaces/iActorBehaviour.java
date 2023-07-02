package Interfaces;

import Classes.Actor;
import Classes.PromotionalClient;

public interface iActorBehaviour {

    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean takeOrder);
    public void setMakeOrder(boolean makeOrder);
    Actor getActor();
}
