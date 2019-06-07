from models.CampingProduct import CampingProduct
from enum import Enum

class Color(Enum):
    RED = 0
    YELLOW = 1
    GREEN = 2

class BackpackType(Enum):
    BAG = 0
    SUITCASE = 1
    BICYCLE_LOCK = 2

class Backpack(CampingProduct):
    def __init__(self, producerName = "none", price = 0, weight = 0, volumes = 0, backpackType = BackpackType.BAG, color = Color.RED):
        super().__init__(producerName, price, weight)
        self.volumes = volumes
        self.backpackType = backpackType
        self.color = color

    def get_volumes(self):
        return self.volumes
    def set_volumes(self, volumes):
        self.volumes = volumes
    def get_backpackType(self):
        return self.backpackType
    def set_backpackType(self, backpackType):
        self.backpackType = backpackType
    def get_color(self):
        return self.color
    def set_color(self, color):
        self.color = color
    def Show(self):
        super().Show()
        print( "Об'єм: " + str(self.volumes) + "\nТип рюкзаку: " + self.backpackType.name + "\nКолір: " + self.color.name, "\n")