import Classes.*;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создание экземпляра супермаркета
        Market magnit = new Market();
        // Создание клиентов супермаркета
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1001);
        iActorBehaviour p = new PensionerClient("Sergey Nikolay", 1111);
        iActorBehaviour tax = new TaxService();
        iActorBehaviour prom = new PromotionalClient("Vanya", "Skidka5%", 1);
        iActorBehaviour prom1 = new PromotionalClient("Genya", "Skidka5%", 2);
        iActorBehaviour prom2 = new PromotionalClient("Taras", "Skidka5%", 3);
        // Ниже два клиента которым товар не должны выдать максимум превышен
        iActorBehaviour prom3 = new PromotionalClient("Erema", "Skidka5%", 4);
        iActorBehaviour prom4 = new PromotionalClient("Ivan", "Skidka5%", 5);

        // Принятие клиентов в супермаркет
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(prom);
        magnit.acceptToMarket(prom1);
        magnit.acceptToMarket(prom2);
        magnit.acceptToMarket(prom3);
        magnit.acceptToMarket(prom4);

        // Обновление состояния супермаркета
        magnit.update();
    }
}