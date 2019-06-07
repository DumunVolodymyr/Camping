from models.CampingProduct import CampingProduct
class CampingManager(object):
    def __init__(self, products: [] = []):
        self.products = products

    def ShowCampingProduct(self):
        for campingProduct in self.products:
            print(campingProduct.Show())
    
    def addCampingProduct(self, product: CampingProduct):
        self.products.append(product)

    def sortCampingProductByWeight(self, reverse: bool = False):
        if(reverse):
            self.products.sort(key=lambda x: x.weight, reverse=True)
        self.products.sort(key=lambda x: x.weight)

    def sortCampingProductByProducerName(self, reverse: bool = False):
        if(reverse):
            self.products.sort(key=lambda x: x.producerName, reverse=True)
        self.products.sort(key=lambda x: x.producerName)