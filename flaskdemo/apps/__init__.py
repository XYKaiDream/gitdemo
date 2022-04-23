from flask import Flask
from apps.user.view import user_bp


def create_app():
    app = Flask(__name__)
    app.register_blueprint(user_bp)
    print(app.url_map)
    return app