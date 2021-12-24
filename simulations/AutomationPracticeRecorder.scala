
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class AutomationPracticeRecorder extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://ranobes.com")
    .inferHtmlResources(AllowList(), DenyList())
  
  private val headers_0 = Map(
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_3 = Map(
  		"Origin" -> "https://ranobes.com",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_7 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "none",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33"
  )
  
  private val headers_22 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
  		"content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
  		"origin" -> "https://ranobes.com",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33",
  		"x-requested-with" -> "XMLHttpRequest"
  )
  
  private val headers_36 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "same-origin",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33"
  )
  
  private val headers_43 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "script",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33"
  )
  
  private val headers_56 = Map(
  		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "image",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33"
  )
  
  private val headers_119 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "script",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33"
  )
  
  private val headers_148 = Map(
  		"accept" -> "application/json, text/javascript, */*; q=0.01",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
  		"content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
  		"origin" -> "https://ranobes.com",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33",
  		"x-requested-with" -> "XMLHttpRequest"
  )
  
  private val headers_811 = Map(
  		"accept" -> "text/html, */*; q=0.01",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
  		"content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
  		"origin" -> "https://ranobes.com",
  		"sec-ch-ua" -> """Chromium";v="96", "Opera";v="82", ";Not A Brand";v="99""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "same-origin",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36 OPR/82.0.4227.33",
  		"x-requested-with" -> "XMLHttpRequest"
  )
  
  private val uri2 = "https://pagead2.googlesyndication.com/pagead"
  
  private val uri3 = "https://use.fontawesome.com/releases/v5.10.0"

  private val scn = scenario("AutomationPracticeRecorder")
    .exec(
      http("request_0")
        .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get("/engine/classes/min/index.php?g=general&v=0.3")
            .headers(headers_0),
          http("request_2")
            .get("/engine/classes/min/index.php?f=engine/classes/js/jqueryui.js,engine/classes/js/dle_js.js&v=0.4")
            .headers(headers_0),
          http("request_3")
            .get("/templates/Dark/fonts/GothaProBol.woff")
            .headers(headers_3),
          http("request_4")
            .get("/templates/Dark/fonts/GothaProIta.woff")
            .headers(headers_3),
          http("request_5")
            .get("/templates/Dark/fonts/GothaProReg.woff")
            .headers(headers_3),

          http("request_32")
            .get("/uploads/posts/2020-01/thumbs/1579700308_war-sovereign-soaring-the-heavens.jpg")
            .headers(headers_0),
          http("request_33")
            .post("/engine/mod_punpun/dle_search/ajax/dle_search.php")
            .headers(headers_22)
            .formParam("query", "warlo")
            .formParam("thisUrl", "/"),
          http("request_34")
            .post("/engine/mod_punpun/dle_search/ajax/dle_search.php")
            .headers(headers_22)
            .formParam("query", "warlock")
            .formParam("thisUrl", "/")
        )
    )
    .pause(1)
    .exec(
      http("request_35")
        .post("/engine/mod_punpun/dle_search/ajax/dle_search.php")
        .headers(headers_22)
        .formParam("news", "https://ranobes.com/ranobe/668-warlock-of-the-magus-world.html")
        .resources(

          http("request_70")
            .get("/engine/data/emoticons/welldone.gif")
            .headers(headers_0),
          http("request_71")
            .get("/engine/data/emoticons/finger.gif")
            .headers(headers_0),
          http("request_72")
            .get("/engine/data/emoticons/naif.gif")
            .headers(headers_0),
          http("request_73")
            .get("/engine/data/emoticons/hiii.gif")
            .headers(headers_0),
          http("request_74")
            .get("/engine/data/emoticons/bow.gif")
            .headers(headers_0),
          http("request_75")
            .get("/engine/data/emoticons/pressure.gif")
            .headers(headers_0),
          http("request_76")
            .get("/engine/data/emoticons/nono.gif")
            .headers(headers_0),
          http("request_77")
            .get("/engine/data/emoticons/crybaby.gif")
            .headers(headers_0),
          http("request_78")
            .get("/engine/data/emoticons/hokage.gif")
            .headers(headers_0),
          http("request_79")
            .get("/engine/data/emoticons/forwhat.gif")
            .headers(headers_0),
          http("request_80")
            .get("/engine/data/emoticons/horribly.gif")
            .headers(headers_0),
          http("request_81")
            .get("/engine/data/emoticons/frost.gif")
            .headers(headers_0),
          http("request_82")
            .get("/engine/data/emoticons/what.gif")
            .headers(headers_0),
          http("request_83")
            .get("/engine/data/emoticons/kef.gif")
            .headers(headers_0),
          http("request_84")
            .get("/engine/data/emoticons/want.gif")
            .headers(headers_0),
          http("request_85")
            .get("/engine/data/emoticons/thrill.gif")
            .headers(headers_0),
          http("request_86")
            .get("/engine/data/emoticons/oru2x.gif")
            .headers(headers_0),
          http("request_87")
            .get("/engine/data/emoticons/escape.gif")
            .headers(headers_0),
          http("request_88")
            .get("/engine/data/emoticons/treat.gif")
            .headers(headers_0),
          http("request_89")
            .get("/engine/data/emoticons/cat.gif")
            .headers(headers_0),
          http("request_145")
            .get("/uploads/fotos/foto_34856.jpg")
            .headers(headers_56),
          http("request_146")
            .get(uri2 + "/managed/js/adsense/m202112060101/show_ads_impl.js")
            .headers(headers_119)
        )
    )
    .pause(7)
    .exec(
      http("request_147")
        .get("/templates/Dark/images/bookmarks.png")
        .headers(headers_56)
    )
    .pause(4)
    .exec(
      http("request_148")
        .post("/engine/mods/post_note/api.php")
        .headers(headers_148)
        .formParam("news_id", "668")
        .formParam("popup", "true")
        .formParam("action", "edit")
        .formParam("skin", "Dark")
    )
    .pause(13)
    .exec(
      http("request_149")
        .post("/engine/mods/post_note/api.php")
        .headers(headers_148)
        .formParam("news_id", "668")
        .formParam("comment", """Favourite
      """)
        .formParam("public", "1")
        .formParam("action", "saveNote")
        .formParam("skin", "Dark")
    )
    .pause(117)
    .exec(
      http("request_150")
        .get("/")
        .headers(headers_36)
        .resources(
          http("request_151")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_152")
            .get("/engine/classes/min/index.php?g=general&v=0.3")
            .headers(headers_0),
          http("request_153")
            .get("/templates/Dark/css/styles.css?v=83")
            .headers(headers_0),
          http("request_154")
            .get("/engine/classes/min/index.php?f=engine/classes/js/jqueryui.js,engine/classes/js/dle_js.js&v=0.4")
            .headers(headers_0),
          http("request_155")
            .get("/templates/Dark/css/engine.css?v=61")
            .headers(headers_0),
          http("request_156")
            .get("/templates/Dark/css/cat.css")
            .headers(headers_0),
          http("request_157")
            .get("/templates/Dark/favdir/assets/js/main.js?v=2")
            .headers(headers_0),
          http("request_175")
            .get("/uploads/posts/2020-11/thumbs/1605345758_the-charm-of-soul-pets.jpg")
            .headers(headers_0),
          http("request_176")
            .get(uri3 + "/webfonts/fa-solid-900.woff2")
            .headers(headers_3)
        )
    )
    .pause(1)
    .exec(
      http("request_177")
        .get("/chapters/you-called-on-the-wrong/244252-1.html")
        .headers(headers_36)
        .resources(
          http("request_178")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_210")
            .get("/engine/data/emoticons/pressure.gif")
            .headers(headers_0),
          http("request_211")
            .get("/engine/data/emoticons/nono.gif")
            .headers(headers_0),
          http("request_212")
            .get("/engine/data/emoticons/crybaby.gif")
            .headers(headers_0),
          http("request_213")
            .get("/engine/data/emoticons/hokage.gif")
            .headers(headers_0),
          http("request_214")
            .get("/engine/data/emoticons/forwhat.gif")
            .headers(headers_0),
          http("request_215")
            .get("/engine/data/emoticons/horribly.gif")
            .headers(headers_0),
          http("request_216")
            .get("/engine/data/emoticons/frost.gif")
            .headers(headers_0),
          http("request_217")
            .get("/engine/data/emoticons/what.gif")
            .headers(headers_0),
          http("request_218")
            .get("/engine/data/emoticons/kef.gif")
            .headers(headers_0),
          http("request_219")
            .get("/engine/data/emoticons/want.gif")
            .headers(headers_0),
          http("request_220")
            .get("/engine/data/emoticons/thrill.gif")
            .headers(headers_0),
          http("request_221")
            .get("/engine/data/emoticons/oru2x.gif")
            .headers(headers_0),
          http("request_222")
            .get("/engine/data/emoticons/escape.gif")
            .headers(headers_0),
          http("request_242")
            .get("/templates/Dark/css/read.css?v=2.1")
            .headers(headers_0),
          http("request_243")
            .get("/engine/data/emoticons/angry4.gif")
            .headers(headers_0),
          http("request_244")
            .get("/engine/data/emoticons/cry6.gif")
            .headers(headers_0),
          http("request_245")
            .get("/engine/data/emoticons/shocked3.gif")
            .headers(headers_0),
          http("request_246")
            .get("/engine/data/emoticons/happy-birthday2.gif")
            .headers(headers_0),
          http("request_247")
            .get("/templates/Dark/fonts/GothaProBol.woff")
            .headers(headers_3),
          http("request_248")
            .get("/templates/Dark/fonts/GothaProIta.woff")
            .headers(headers_3),
          http("request_249")
            .get("/templates/Dark/fonts/GothaProReg.woff")
            .headers(headers_3),
          http("request_250")
            .get("/templates/Dark/dleimages/noavatar.png")
            .headers(headers_0),
          http("request_251")
            .get("/templates/Dark/js/lib.js?v=50.1")
            .headers(headers_0),
          http("request_252")
            .get("/templates/Dark/favdir/assets/js/main.js?v=2")
            .headers(headers_0),
          http("request_253")
            .get("/templates/Dark/post_note/assets/js/main.js?v=4")
            .headers(headers_0),
          http("request_254")
            .get("/templates/Dark/js/comments_sort.js?v=1")
            .headers(headers_0),
          http("request_255")
            .get("/templates/Dark/post_note/assets/css/main.css?v=7")
            .headers(headers_0),
          http("request_256")
            .get("/templates/Dark/mod_punpun/dle_search/js/dle_search.js")
            .headers(headers_0),
          http("request_266")
            .get("/uploads/fotos/foto_36699.jpg")
            .headers(headers_56),
          http("request_267")
            .get("/uploads/fotos/foto_35156.jpg")
            .headers(headers_56)
        )
    )
    .pause(1)
    .exec(
      http("request_268")
        .get("/chapters/you-called-on-the-wrong/244254-1.html")
        .headers(headers_36)
        .resources(
          http("request_269")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_270")
            .get("/engine/classes/min/index.php?g=general&v=0.3")
            .headers(headers_0),
          http("request_271")
            .get("/engine/classes/min/index.php?f=engine/classes/js/jqueryui.js,engine/classes/js/dle_js.js,engine/classes/js/bbcodes.js&v=0.4")
            .headers(headers_0),
          http("request_272")
            .get("/engine/data/emoticons/satisfied.gif")
            .headers(headers_0),
          http("request_273")
            .get("/engine/data/emoticons/joy.gif")
            .headers(headers_0),
          http("request_336")
            .get("/engine/data/emoticons/shocked3.gif")
            .headers(headers_0),
          http("request_337")
            .get("/engine/data/emoticons/happy-birthday2.gif")
            .headers(headers_0),
          http("request_338")
            .get("/templates/Dark/fonts/GothaProBol.woff")
            .headers(headers_3),
          http("request_339")
            .get("/templates/Dark/fonts/GothaProIta.woff")
            .headers(headers_3),
          http("request_340")
            .get("/templates/Dark/fonts/GothaProReg.woff")
            .headers(headers_3),
          http("request_341")
            .get("/templates/Dark/dleimages/noavatar.png")
            .headers(headers_0),
          http("request_342")
            .get("/templates/Dark/favdir/assets/js/main.js?v=2")
            .headers(headers_0),
          http("request_343")
            .get("/templates/Dark/post_note/assets/js/main.js?v=4")
            .headers(headers_0),
          http("request_344")
            .get("/templates/Dark/js/lib.js?v=50.1")
            .headers(headers_0),
          http("request_345")
            .get("/templates/Dark/js/comments_sort.js?v=1")
            .headers(headers_0),
          http("request_346")
            .get("/templates/Dark/post_note/assets/css/main.css?v=7")
            .headers(headers_0),
          http("request_347")
            .get("/templates/Dark/mod_punpun/dle_search/js/dle_search.js")
            .headers(headers_0),
          http("request_348")
            .get(uri3 + "/css/all.css")
            .headers(headers_0),
          http("request_349")
            .get(uri2 + "/js/adsbygoogle.js")
            .headers(headers_0),
          http("request_350")
            .get("/uploads/fotos/foto_7707.jpg")
            .headers(headers_56),
          http("request_351")
            .get("/uploads/fotos/foto_6330.jpg")
            .headers(headers_56),
          http("request_352")
            .get("/uploads/fotos/foto_9997.jpg")
            .headers(headers_56),
          http("request_353")
            .get("/uploads/fotos/foto_31992.jpg")
            .headers(headers_56),
          http("request_440")
            .get("/uploads/fotos/foto_32192.jpg")
            .headers(headers_56),
          http("request_441")
            .get("/uploads/fotos/foto_13222.jpg")
            .headers(headers_56),
          http("request_442")
            .get("/uploads/fotos/foto_13247.jpg")
            .headers(headers_56),
          http("request_443")
            .get("/uploads/fotos/foto_22801.jpg")
            .headers(headers_56),
          http("request_444")
            .get("/uploads/fotos/foto_299.jpg")
            .headers(headers_56),
          http("request_445")
            .get("/uploads/fotos/foto_9963.png")
            .headers(headers_56),
          http("request_446")
            .get("/uploads/fotos/foto_26174.png")
            .headers(headers_56),
          http("request_447")
            .get("/uploads/fotos/foto_18721.jpg")
            .headers(headers_56),
          http("request_448")
            .get("/uploads/fotos/foto_20812.jpg")
            .headers(headers_56),
          http("request_449")
            .get("/uploads/fotos/foto_12487.jpg")
            .headers(headers_56),
          http("request_450")
            .get("/chapters/you-called-on-the-wrong/244258-1.html")
            .headers(headers_36),
          http("request_451")
            .get("/chapters/you-called-on-the-wrong/244258-1.html")
            .headers(headers_36),
          http("request_452")
            .get("/chapters/you-called-on-the-wrong/244258-1.html")
            .headers(headers_36),
          http("request_453")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_454")
            .get("/engine/classes/min/index.php?g=general&v=0.3")
            .headers(headers_0),
          http("request_553")
            .get("/templates/Dark/fonts/GothaProBol.woff"),
          http("request_554")
            .get("/templates/Dark/fonts/GothaProIta.woff"),
          http("request_555")
            .get("/templates/Dark/fonts/GothaProReg.woff")
        )
    )
    .pause(1)
    .exec(
      http("request_556")
        .get("/chapters/you-called-on-the-wrong/244259-1.html")
        .headers(headers_36)
        .resources(
          http("request_557")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_558")
            .get("/engine/classes/min/index.php?g=general&v=0.3")
            .headers(headers_0),
          http("request_559")
            .get("/engine/classes/min/index.php?f=engine/classes/js/jqueryui.js,engine/classes/js/dle_js.js,engine/classes/js/bbcodes.js&v=0.4")
            .headers(headers_0),
          http("request_620")
            .get("/engine/data/emoticons/very-shy.gif")
            .headers(headers_0),
          http("request_621")
            .get("/engine/data/emoticons/kiaa.gif")
            .headers(headers_0),
          http("request_622")
            .get("/engine/data/emoticons/angry4.gif")
            .headers(headers_0),
          http("request_623")
            .get("/engine/data/emoticons/cry6.gif")
            .headers(headers_0),
          http("request_639")
            .get("/uploads/fotos/foto_36699.jpg")
            .headers(headers_0),
          http("request_640")
            .get("/uploads/fotos/foto_32192.jpg")
            .headers(headers_0),
          http("request_641")
            .get("/uploads/fotos/foto_30003.jpg")
            .headers(headers_56),
          http("request_642")
            .get("/uploads/fotos/foto_19755.jpg")
            .headers(headers_56),
          http("request_643")
            .get("/uploads/fotos/foto_35989.jpg")
            .headers(headers_56),
          http("request_644")
            .get("/uploads/fotos/foto_35341.jpg")
            .headers(headers_56),
          http("request_645")
            .get("/uploads/fotos/foto_36650.webp")
            .headers(headers_56),
          http("request_646")
            .get("/uploads/fotos/foto_14152.jpg")
            .headers(headers_56),
          http("request_647")
            .get("/uploads/fotos/foto_1215.png")
            .headers(headers_56),
          http("request_648")
            .get("/uploads/fotos/foto_18058.jpg")
            .headers(headers_56),
          http("request_649")
            .get(uri3 + "/webfonts/fa-solid-900.woff2")
            .headers(headers_3),
          http("request_650")
            .get("/uploads/fotos/foto_31640.jpg")
            .headers(headers_56)
        )
    )
    .pause(1)
    .exec(
      http("request_651")
        .get("/chapters/you-called-on-the-wrong/")
        .headers(headers_36)
        .resources(
          http("request_652")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_665")
            .get(uri3 + "/css/all.css")
            .headers(headers_0),
          http("request_666")
            .get("/templates/Dark/fonts/GothaProBol.woff")
            .headers(headers_3),
          http("request_667")
            .get("/templates/Dark/fonts/GothaProIta.woff")
            .headers(headers_3),
          http("request_668")
            .get("/templates/Dark/fonts/GothaProReg.woff")
            .headers(headers_3),
          http("request_669")
            .get(uri2 + "/js/adsbygoogle.js")
            .headers(headers_0),
          http("request_670")
            .get("/templates/Dark/dleimages/noavatar.png")
            .headers(headers_0),
          http("request_671")
            .get(uri3 + "/webfonts/fa-solid-900.woff2")
            .headers(headers_3)
        )
    )
    .pause(2)
    .exec(
      http("request_672")
        .get("/")
        .headers(headers_36)
        .resources(
          http("request_673")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_674")
            .get("/engine/classes/min/index.php?g=general&v=0.3")
            .headers(headers_0),
          http("request_698")
            .get(uri3 + "/webfonts/fa-solid-900.woff2")
            .headers(headers_3)
        )
    )
    .pause(1)
    .exec(
      http("request_699")
        .get("/chapters/you-called-on-the-wrong/244252-1.html")
        .headers(headers_36)
        .resources(
          http("request_700")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_701")
            .get("/engine/classes/min/index.php?g=general&v=0.3")
            .headers(headers_0),
          http("request_702")
            .get("/engine/classes/min/index.php?f=engine/classes/js/jqueryui.js,engine/classes/js/dle_js.js,engine/classes/js/bbcodes.js&v=0.4")
            .headers(headers_0),
          http("request_703")
            .get("/engine/data/emoticons/satisfied.gif")
            .headers(headers_0),
          http("request_704")
            .get("/engine/data/emoticons/joy.gif")
            .headers(headers_0),
          http("request_705")
            .get("/engine/data/emoticons/boast.gif")
            .headers(headers_0),
          http("request_706")
            .get("/engine/data/emoticons/gloom.gif")
            .headers(headers_0),
          http("request_707")
            .get("/engine/data/emoticons/quiet.gif")
            .headers(headers_0),
          http("request_809")
            .get("/templates/Dark/dleimages/noavatar.png")
            .headers(headers_0),
          http("request_810")
            .get(uri3 + "/webfonts/fa-solid-900.woff2")
            .headers(headers_3)
        )
    )
    .pause(2)
    .exec(
      http("request_811")
        .post("/engine/mods/chapters.php")
        .headers(headers_811)
        .formParam("search", "rfvty")
        .formParam("id", "360")
    )
    .pause(1)
    .exec(
      http("request_812")
        .post("/engine/mods/chapters.php")
        .headers(headers_811)
        .formParam("search", "ка")
        .formParam("id", "360")
    )
    .pause(1)
    .exec(
      http("request_813")
        .post("/engine/mods/chapters.php")
        .headers(headers_811)
        .formParam("search", "камень")
        .formParam("id", "360")
        .resources(
          http("request_814")
            .get("/chapters/you-called-on-the-wrong/255391-tom-4-glava-236-kamen-lu-chast-13.html")
            .headers(headers_36),
          http("request_815")
            .get("/cdn-cgi/apps/head/Qsk6oHygN1QhPTxTi2AnVJZRPQs.js")
            .headers(headers_0),
          http("request_904")
            .get("/templates/Dark/fonts/GothaProIta.woff")
            .headers(headers_3),
          http("request_905")
            .get("/templates/Dark/fonts/GothaProReg.woff")
            .headers(headers_3),
          http("request_906")
            .get(uri3 + "/webfonts/fa-solid-900.woff2")
            .headers(headers_3)
        )
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
