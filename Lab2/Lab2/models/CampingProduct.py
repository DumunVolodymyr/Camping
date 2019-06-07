from abc import ABC, abstractmethod

class CampingProduct(ABC):
    def __init__(self, producerName = "none", price = 0, weight = 0):
        self.producerName = producerName
        self.price = price
        self.weight = weight
    def get_producerName(self):
        return self.producerName
    def set_producerName(self, producerName):
        self.producerName = producerName
    def get_price(self):
        return self.price
    def set_price(self, price):
        self.price = price
    def get_weight(self):
        return self.weight
    def set_weight(self, weight):
        self.weight = weight
    @abstractmethod
    def Show(self):
        print("Виробник: " + self.producerName + "\nЦіна: " + str(self.price) + "\nВага: " + str(self.weight))