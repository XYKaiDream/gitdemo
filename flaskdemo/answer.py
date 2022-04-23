from multiprocessing.pool import ThreadPool
from selenium.webdriver.support.ui import WebDriverWait
import time
import random
from selenium.webdriver import Chrome, ActionChains
from selenium.webdriver.chrome.options import Options
import rand
class Wdx():
    def __init__(self):
        chrome_options = Options()
        ran_time = random.randint(1, 10)
        time.sleep(ran_time)
        # re = 代理池代理ip
        # chrome_options.add_argument("--headless")
        # 去除webdriver特征
        chrome_options.add_argument("--disable-blink-features=AutomationControlled")
        chrome_options.add_argument("--proxy-server=" + '代理池')
        # 防止windows识别，添加期权
        chrome_options.add_experimental_option('excludeSwitches', ['enable-automation'])
        chrome_options.add_argument('user-agent=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.82 Safar')
        self.driver = Chrome(options=chrome_options)

    def run(self):
        self.driver.get('链接')
        # 开头智能验证
        try:
            self.driver.implicitly_wait(1)
            self.driver.find_element_by_xpath('//*[@id="alert_box"]/div[2]/div[2]/button').click()
            #//*[@id="rectTop"]
            self.driver.find_element_by_xpath('//*[@id="rectTop"]').click()
        except:
            pass
        # 答题区域
        # 1\
        d = rand.CreatRandomnumbers(1, 4, 1)
        ran = d.creatrandomnumbers()
        self.driver.find_element_by_xpath('//*[@id="div1"]/div[2]/div['+str(ran[0]) +']/div').click()
        # 2\
        self.driver.find_element_by_xpath('//*[@id="div2"]/div[2]/div[' + str(random.randint(1, 2)) + ']/div').click()
        #3\
        d = rand.CreateRandomPage(1, 5, 1)
        ran2 = d.createrandompage()
        self.driver.find_element_by_xpath('//*[@id="div3"]/div[2]/div['+str(ran2[0])+']/div').click()
        # 4/
        d = rand.CreateRandomPage(1, 7, 1)
        ran4 = d.createrandompage()
        self.driver.find_element_by_xpath('//*[@id="div4"]/div[2]/div['+str(ran4[0])+']/div').click()
        # 5\
        self.driver.find_element_by_xpath('//*[@id="div5"]/div[2]/div['+ str(random.randint(1, 3)) +']/div').click()
        # 6\
        d = rand.CreateRandomPage(1, 9, 1)
        ran5 = d.createrandompage()
        self.driver.find_element_by_xpath('//*[@id="div6"]/div[2]/div['+str(ran5[0])+']/div').click()
        # self.driver.find_element_by_xpath('//*[@id="div6"]/div[2]/div['+ran5+']/div').click()
        # 7\
        d = rand.CreateRandomPage(1, 9, 1)
        ran6 = d.createrandompage()
        self.driver.find_element_by_xpath('//*[@id="div7"]/div[2]/div['+str(ran6[0])+']/div').click()
        # 8\
        d = rand.CreateRandomPage(1,5,3)
        res = d.createrandompage()
        self.driver.find_element_by_xpath('//*[@id="div8"]/div[2]/div['+str(res[0])+']/div').click()
        self.driver.find_element_by_xpath('//*[@id="div8"]/div[2]/div[' + str(res[1]) + ']/div').click()
        self.driver.find_element_by_xpath('//*[@id="div8"]/div[2]/div[' + str(res[2]) + ']/div').click()
        # 9\
        d = rand.CreateRandomPage(1,5,2)
        res = d.createrandompage()
        self.driver.find_element_by_xpath('//*[@id="div9"]/div[2]/div['+str(res[0])+']/div').click()
        self.driver.find_element_by_xpath('//*[@id="div9"]/div[2]/div[' + str(res[1]) + ']/div').click()
        # 10\
        self.driver.find_element_by_xpath('//*[@id="div10"]/div[2]/div['+str(res[0])+']/div').click()
        self.driver.find_element_by_xpath('//*[@id="div10"]/div[2]/div[' + str(res[1]) + ']/div').click()
        # 11\
        d = rand.CreateRandomPage(1,6,2)
        res = d.createrandompage()
        self.driver.find_element_by_xpath('//*[@id="div11"]/div[2]/div['+str(res[0])+']/div').click()
        self.driver.find_element_by_xpath('//*[@id="div11"]/div[2]/div['+str(res[1]) + ']/div').click()
        # 12\
        self.driver.find_element_by_xpath('//*[@id="div12"]/div[2]/div['+str(random.randint(1,2))+']/div').click()
        # 13
        for i in range(0,3):
            d = rand.CreateRandomPage(1, 6, 3)
            res = d.createrandompage()
            self.driver.find_element_by_xpath('//*[@id="div13"]/div[2]/div['+str(res[0])+']/div').click()

        # 14
        for i in range(0,5):
            d = rand.CreateRandomPage(1, 7, 5)
            res = d.createrandompage()
            self.driver.find_element_by_xpath('//*[@id="div14"]/div[2]/div['+str(res[i])+']/div').click()
        # //*[@id="ctlNext"]
        # 15
        for i in range(0,7):
            d = rand.CreateRandomPage(1, 10, 7)
            res = d.createrandompage()
            self.driver.find_element_by_xpath('//*[@id="div15"]/div[2]/div['+str(res[i])+']/div').click()
        # 16
        for i in range(1,11):
            d = rand.CreateRandomPage(1, 4, 1)
            res = d.createrandompage()
            # //*[@id="drv16_1"]/td[1]/a
            self.driver.find_element_by_xpath('//*[@id="drv16_'+str(i)+'"]/td['+str(res[i])+']/a').click()
        #     17
        for i in range(0,5):
            d = rand.CreateRandomPage(1, 7, 5)
            res = d.createrandompage()
            self.driver.find_element_by_xpath('//*[@id="div17"]/div[2]/div['+str(res[i])+']/div').click()
        # 18
        # //*[@id="div18"]/div[2]/div[1]/div
        d = rand.CreateRandomPage(1,7,5)
        res = d.createrandompage()
        for i in range(0,5):
            self.driver.find_element_by_xpath('//*[@id="div18"]/div[2]/div['+str(res[i])+']/div').click()
        # 结束答题区域
        # 设置等待时间增加答卷真实性
        ran_time = random.randint(150,300)
        time.sleep(ran_time)
        # 点击提交
        self.driver.find_element_by_xpath('//*[@id="ctlNext"]').click()
        # 智能验证
        try:
            self.driver.implicitly_wait(1)
            self.driver.find_element_by_xpath('//*[@id="alert_box"]/div[2]/div[2]/button').click()
            #//*[@id="rectTop"]
            self.driver.find_element_by_xpath('//*[@id="rectTop"]').click()
            self.driver.implicitly_wait(3)
            # 滑块验证
            # 找到滑块
            Hk = self.driver.find_element_by_css_selector("#nc_1_n1z")
            # 整个div滑块
            div_Hk = self.driver.find_element_by_css_selector("#nc_1__scale_text")
            time.sleep(2)
            ActionChains(self.driver).drag_and_drop_by_offset(Hk, div_Hk.size["width"], -div_Hk.size["height"]).perform()
            # 验证之后点击提交
            self.driver.find_element_by_xpath('//*[@id="ctlNext"]').click()
        except:
            pass
        #有时会跳二次验证
        try:
            self.driver.find_element_by_xpath('//*[@id="alert_box"]/div[2]/div[2]/button').click()
            self.driver.find_element_by_xpath('//*[@id="rectTop"]').click()
        except:
            print("这里没有验证")
        print("完成")
        # 运行完毕自动关闭浏览器
        self.driver.quit()

if __name__ == "__main__":
    # Wdx().run()
    for i in range(1,30):
        pool = ThreadPool(5)
        results = pool.map(Wdx().run, range(1, 5))
