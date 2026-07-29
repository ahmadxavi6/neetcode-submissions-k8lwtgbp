class MinStack:
    def __init__(self):
        self.stack = []
        self.minElementstack = []

    def push(self, val: int) -> None:
        self.stack.append(val)

        if not self.minElementstack or val <= self.minElementstack[-1]:
            self.minElementstack.append(val)

    def pop(self) -> None:
        if self.stack:
            val = self.stack.pop()

            if val == self.minElementstack[-1]:
                self.minElementstack.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.minElementstack[-1]