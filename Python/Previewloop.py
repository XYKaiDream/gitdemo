from flask import Flask,render_template,request

app = Flask(__name__)

@app.route('/')
def login():
    return 'okllll'

def replace():
    return 'demo 冲突'

app.add_template_filter()


if __name__ == '__main__':
    app.run()
    print("4565")
    print("master-game")
    print(123)
