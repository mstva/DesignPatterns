class Duck:
    """this is a Duck class"""
    def __init__(self, name):
        self.name = name

    def quack(self):
        print(f'the {self.name} is quacking')

    def swim(self):
        print(f'the {self.name} is swimming')

    def display(self):
        print(f'I am a {self.name}')
