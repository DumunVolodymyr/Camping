from models.CampingProduct import CampingProduct
from enum import Enum

class TentForm(Enum):
    LODGE = 0
    HEMISPHERE = 1
    MAQUEE = 2

class Construction(Enum):
    ONE_STORY = 0
    TWO_STORY = 1

class Tent(CampingProduct):
    def __init__(self, producerName = "none", price = 0, weight = 0, capacity = 0, construction = Construction.ONE_STORY, tentForm = TentForm.HEMISPHERE):
        super().__init__(producerName, price, weight)
        self.capacity = capacity
        self.construction = construction
        self.tentForm = tentForm

    def get_capacity(self):
        return self.capacity
    def set_capacity(self, capacity):
        self.capacity = capacity
    def get_construction(self):
        return self.construction
    def set_construction(self, construction):
        self.construction = construction
    def get_tentForm(self):
        return self.tentForm
    def set_tentForm(self, tentForm):
        self.tentForm = tentForm
    def Show(self):
        super().Show()
        print( "Місткість: " + str(self.capacity) + "\nКонструкція: " + self.construction.name + "\nФорма палатки: " + self.tentForm.name, "\n")