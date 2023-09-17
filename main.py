from enum import Enum
from fastapi import FastAPI

class ModelName(str, Enum):
    alexnet = "alexnet"
    resnet = "resnet"
    lenet = "lenet"

app = FastAPI()

item_db = [{"item_name": "Foo"}, {"item_name": "Bar"}]

@app.get("/items/{item_id}")
async def read_item(item_id: str, quantity: int | None = None, short: bool = False):
    item = {"item_id": item_id}    
    if quantity:
        item.update({"quantity": quantity})
    if not short:
        item.update({"short": "short"})
    return item
