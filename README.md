# dieGame

Prerequisites:
- Primitive Data Types
- Loops
- Arrays
- Classes
- Interfaces
  
Learning Objectives:
- Using interfaces
- Using simulation to test alternative strategies

  Bu projede, Die adlı çok oyunculu bir zar oyununu uyguladım. Oyunun temel amacı, 100 puanlık bir hedefe ilk ulaşan oyuncunun galip gelmesidir. Her oyuncu sırası geldiğinde zarları atar ve biriktirdiği puanları kontrol eder. Oyuncunun her hamlesinde iki seçenek vardır: "roll" ve "hold".

Bu proje kapsamında, farklı stratejileri test etmek için çeşitli sınıflar ve arayüzler oluşturdum. Öncelikle, DiePlayer arayüzünü uygulayarak genel bir Die oyuncusu tanımladım. Ardından, stratejileri temsil etmek üzere HoldAt20DiePlayer, HoldAt25DiePlayer ve RaceToGoalDiePlayer sınıflarını oluşturdum. Bu sınıflar, farklı kriterlere dayanarak oyuncuların zar atma veya durma kararlarını belirler.

Ayrıca, UserDiePlayer sınıfını oluşturarak bir insan oyuncunun oynamasını sağladım. Bu sınıf, komut satırında oyuncuya hamle yapma seçenekleri sunar ve kullanıcının tercihine göre zar atmayı veya durmayı işler.

Kendi stratejimi temsil etmek için MyDiePlayer sınıfını oluşturdum. Bu strateji, belirli bir puan eşiğini aşan veya hedef puana yaklaşan durumlarda oyuncunun kararını belirler.

DieGame sınıfı, oyunun kurallarını uygulayan sınıftır. Oyuncuları ve puanları takip etmek için özel veri üyeleri ekledim. playTurn() yöntemiyle her turu simüle ettim ve getMaxScore() yöntemiyle en yüksek puana sahip oyuncuyu buldum. Ayrıca, printScores() yöntemini kullanarak oyuncuların puanlarını ekrana yazdırdım.

Son olarak, PlayDie sınıfını oluşturdum ve main yöntemini kullanarak oyunu test ettim. Farklı stratejilere sahip bilgisayar oyuncuları ve UserDiePlayer sınıfını kullanarak oyunu oynamak veya istatistikleri hesaplamak için bu sınıfı kullandım.

Projeyi tamamlarken, 1000 kez oyun oynatarak istatistiksel verileri topladım. Her stratejinin kazanma yüzdesini hesapladım ve sonuçları "statistics.txt" adlı bir metin dosyasına kaydettim. Bu dosyada, her stratejinin performansını değerlendirerek en iyi stratejiyi belirledim ve diğer gözlemlerimi paylaştım.

Yani bu projede, farklı stratejilerle oynanabilir bir oyun olan die game in nesne tabanlı bir uygulamasını oluşturarak çeşitli stratejileri test ettim ve kendi stratejimin diğer stratejilerle karşılaştırmasını yaparak oyunun dinamiklerini keşfettim
