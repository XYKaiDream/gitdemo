#导入数据库模块
import pymysql
#导入Flask框架，这个框架可以快捷地实现了一个WSGI应用
from flask import Flask, request, render_template, redirect, url_for
import traceback
#传递根目录
app = Flask(__name__)
class Boy():
    def __init__(self,name,grendar):
        self.name = name
        self.grendar = grendar
    def __str__(self):
        return self.name
#默认路径访问登录页面
print("123")
@app.route('/')
def show():
    list = [
        {'username':"123","password":'ddd'},
        {'username': "cas3", "password": 'h6d'},
        {'username': "cwev323", "password": 'n4d'},
        {'username': "vtefg3", "password": '12ds'}
            ]
    return render_template('show.html',list = list)
@app.route('/base')
def base():
    return  redirect(url_for())

@app.route('/base2')
def base2():
    return render_template('base.html')

@app.route('/marco')
def marco():
    return render_template('macro.html')

if __name__ == '__main__':
    app.run()