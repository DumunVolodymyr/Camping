from models.Backpack import Backpack, BackpackType, Color
from models.SleepingBag import SleepingBagMaterial
from models.Tent import TentForm
from models.Tent import Construction
from manager.CampingManager import CampingManager
from models.Tent import Tent
from models.SleepingBag import SleepingBag
def main():
    cm = CampingManager()

    cm.addCampingProduct(Tent("Reebok", 500, 20, 4, Construction.ONE_STORY, TentForm.LODGE))
    cm.addCampingProduct(Backpack("Adidas", 15, 500, 40, BackpackType.BAG, Color.RED))
    cm.addCampingProduct(SleepingBag("Aer", 30, 500, "Blanket", 2, SleepingBagMaterial.WOOL))

    print("Список товарів: ", "\n")
    cm.ShowCampingProduct()

    cm.sortCampingProductByWeight()

    print("Сортування по вазі", "\n")
    cm.ShowCampingProduct()

    cm.sortCampingProductByProducerName();

    print("Сортування по імені виробника", "\n")
    cm.ShowCampingProduct()

if __name__ == '__main__':
    main()