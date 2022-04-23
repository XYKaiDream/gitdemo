
#导入Flask框架，这个框架可以快捷地实现了一个WSGI应用
import requests
from flask import Flask, render_template, Response, request
import pymysql
#传递根目录
from apps import create_app

app = create_app()

class Boy():
    def __init__(self,name,grendar):
        self.name = name
        self.grendar = grendar
    def __str__(self):
        return self.name

@app.route('/')
def login():
    return  render_template('login.html')
@app.route('/register')
def register():
    return render_template('register.html')
#默认路径访问登录页面
@app.route('/login',methods=['GET','POST'])
def demo():
    db = pymysql.connect('localhost','root','123456','datademo')
    cur = db.cursor()
    try:
        sql = "select * from users where username="+request.args.get('user')+" and passwd="+request.args.get('password')+""
        cur.execute(sql)
        result = cur.fetchall()
        print(result)
        if len(result) == 1:
            db.commit()
            db.close()
            return '登陆成功'
        else:
            login_massage = "用户名密码错误"
            return render_template('login.html', message=login_massage)
    except:
        print("sql错误")
        return render_template('login.html')


@app.route('/registser',methods=['GET','POST'])
def demo2():
    db = pymysql.connect('localhost', 'root', '123456', 'datademo')
    cur = db.cursor()
    username = request.args.get('user')
    passwd = request.args.get('password')
    try:
        sql = "insert into users(username, passwd) VALUES ('%s','%s')" %(request.args.get('user'),request.args.get('password'))
        cur.execute(sql)
        db.commit()
    except:
        return "注册失败"

    return '注册成功'
if __name__ == '__main__':
    app.run(host='0.0.0.0',port=5000,debug=True)