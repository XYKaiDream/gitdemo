from flask import Blueprint

user_bp = Blueprint('user',__name__)
@user_bp.route('/')
def user_begin():
    return "ok"