from math import sqrt

class Imaginary(object):
    def __init__(self, r, i):
        super().__init__()
        self.r = r
        self.i = i
    
    @staticmethod
    def from_string(string):
        r, i = [float(x) for x in string.split()]
        return Imaginary(r, i)
    
    def conjugate(self):
        return Imaginary(self.r, -self.i)
    
    def modulus(self):
        return Imaginary(abs(self), 0)
    
    def __add__(self, other):
        return Imaginary(self.r + other.r, self.i + other.i)
    
    def __sub__(self, other):
        return Imaginary(self.r - other.r, self.i - other.i)
    
    def __mul__(self, other):
        real = self.r*other.r - self.i*other.i
        im = self.r*other.i + self.i*other.r
        return Imaginary(real, im)
    
    def __abs__(self):
        return sqrt(self.r**2 + self.i**2)
    
    def __truediv__(self, other):
        res = self*other.conjugate()
        denominator = abs(other)**2
        res.r = res.r/denominator
        res.i = res.i/denominator
        return res
    
    def __str__(self):
        return "{:.2f}{:+.2f}i".format(self.r, self.i)
    

c1 = Imaginary.from_string(input())
c2 = Imaginary.from_string(input())
print(c1 + c2)
print(c1 - c2)
print(c1*c2)
print(c1/c2)
print(c1.modulus())
print(c2.modulus())