from flask import Flask,render_template,request

app = Flask(__name__)

@app.route('/')
def login():
    return 'okllll'

def replace():
    return 'replaace'

app.add_template_filter()


if __name__ == '__main__':
    app.run()
    print("master-game")
