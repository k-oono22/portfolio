<?php 
$fp = fopen("info.txt","r");
$line = array();
$body = '';
if($fp){
  while(!feof($fp)){
    $line[]=fgets($fp);
  }
  fclose($fp);
}
$youtube = $data = null;
if (isset($_REQUEST["text"]) == true)
{
  $data = $youtube_url = $_REQUEST["text"];
  $data = htmlspecialchars($data, ENT_QUOTES);
  if (strpos($youtube_url, "watch") != false)	/* ページURL ? */
  {
  $youtube_url = substr($youtube_url, (strpos($youtube_url, "=")+1));
  }
  else
  {
  $youtube_url = substr($youtube_url, (strpos($youtube_url, "youtu.be/")+9));
  }
$youtube = "<iframe width=\"100%\" height=\"400\" src=\"https://www.youtube.com/embed/${youtube_url}\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
}
?>
<!doctype html>
<html lang="ja" >
<meta charset="shift_jis">
  <head>
    <title>サークルサイト</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  </head>
  <body>

    <?php include('navbar.php'); ?>

    <main role="main" class="container" style="padding:60px 15px 0">
      <div>
        <!-- ここから「本文」-->
        <h1>お知らせ</h1>
        <?php
        if(count($line)>0){
          for($i = 0;$i<count($line);$i++){
            if($i==0){
              echo'<h2>'.$line[0].'</h2>';
            }
            else{
              $body .=$line[$i].'<br>';
            }
          }
        }
        else{
          $body='お知らせはありません';
        }
        echo '<p>'.$body.'</p>';
        ?>
        <video scr = "movie/sample.mp4" controls = "movie/sample.mp4" controls width = "600" heigth = "600" src = "movie/sample.mp4" preload = "metadata" src = "movie/sample.mp4"></video>
        <video scr = "movie/ssr.mp4" controls = "movie/ssr.mp4" controls width = "600" heigth = "600" src = "movie/ssr.mp4" preload = "metadata" src = "ssr.mp4"></video>
        <video scr = "movie/ロータス サイファー 圧縮.mp4" controls = "movie/ロータス サイファー 圧縮.mp4" controls width= "600" heigth = "600" src = "movie/ロータス サイファー 圧縮.mp4" prelode = "metadata" src = "movie/ロータス サイファー 圧縮.mp4"></video>
        <style type="text/css">
article 
{
	width: 600px;
	margin-top: 100px;
	margin-right: auto;
	margin-left: auto;
	border: 1px solid #CCC;
	text-align: center;
	padding: 30px;
	border-radius: 6px;
	-webkit-border-radius: 6px;
	-moz-border-radius: 6px;
 
}
div
{
	text-align: center;
}
 
</style>
</head>
 
<body>
<article>
<form action="" method="post">
<p>↓↓↓YoutubeのURLを入力↓↓↓</p>
<input name="text" type="text" value="<?php echo $data; ?>" style="width:90%;">
<input name="" type="submit">
</form>
 
<div><?php echo $youtube; ?></div>
 
</article>
        <!-- 本文ここまで -->
      </div>
    </main>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="/docs/4.5/assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
  </body>
</html>