from fastapi import FastAPI

app = FastAPI()


@app.get("/hello")
async def helloworld():
    return {"message": "Hello World"}