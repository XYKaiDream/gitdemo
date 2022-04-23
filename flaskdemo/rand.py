import random
class CreatRandomnumbers:
    def __init__(self, start, end, numbercount):
        self.start = start
        self.end = end
        self.numbercount = numbercount
        self.list = []
        self.flag = 0
    def creatrandomnumbers(self):
        tempInt = random.randint(self.start, self.end)
        print(tempInt)
        if(self.flag < self.numbercount):
            if(tempInt not in self.list):
                self.list.append(tempInt)
                self.flag += 1
            self.creatrandomnumbers()
        return self.list
if __name__ == '__main__':
    a = CreatRandomnumbers(1,10,3).creatrandomnumbers()
    print(a)