from models.CampingProduct import CampingProduct
from enum import Enum

class SleepingBagMaterial(Enum):
    HOLLQWFIBER = 0
    THERMOLITE = 1
    WOOL = 2

class SleepingBag(CampingProduct):
    def __init__(self, producerName = "none", price = 0, weight = 0, type = "none", lenght = 0, sleepingBagMaterial = SleepingBagMaterial.HOLLQWFIBER):
        super().__init__(producerName, price, weight)
        self.type = type
        self.lenght = lenght
        self.sleepingBagMaterial = sleepingBagMaterial

    def get_type(self):
        return self.type
    def set_type(self, type):
        self.type = type
    def get_lenght(self):
        return self.lenght
    def set_lenght(self, lenght):
        self.lenght = lenght
    def get_sleepingBagMaterial(self):
        return self.sleepingBagMaterial
    def set_sleepingBagMaterial(self, sleepingBagMaterial):
        self.sleepingBagMaterial = sleepingBagMaterial
    def Show(self):
        super().Show()
        print( "Тип: " + str(self.type) + "\nДовжина: " + str(self.lenght) + "\nМатеріал: " + self.sleepingBagMaterial.name, "\n")