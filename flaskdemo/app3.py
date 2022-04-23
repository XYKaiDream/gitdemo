import cv2
from flask import Flask, render_template, Response

app = Flask(__name__)


@app.route('/')
def index():
    return render_template('index.html')


def gen():
    video_path = 'D:\迅雷下载\Cheaper.by.the.Dozen.2022.1080p.WEBRip.x264-RARBG\Cheaper.by.the.Dozen.2022.1080p.WEBRip.x264-RARBG.mp4'
    vid = cv2.VideoCapture(video_path)
    while True:
        return_value, frame = vid.read()
        image = cv2.imencode('.jpg', frame)[1].tobytes()
        yield (b'--frame\r\n'
               b'Content-Type: image/jpeg\r\n\r\n' + image + b'\r\n')


@app.route('/video_feed')
def video_feed():
    return Response(gen(), mimetype='multipart/x-mixed-replace; boundary=frame')


if __name__ == '__main__':
    app.run()
