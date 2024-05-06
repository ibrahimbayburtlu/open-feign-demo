# Spring Cloud OpenFeign Demo Projesi

Bu proje, Spring Cloud OpenFeign kütüphanesini kullanarak mikrohizmet mimarisi altında RESTful servisler arasında iletişim kurmayı göstermektedir. Ayrıca, proje Feign Client'in sunduğu avantajları ve nasıl kullanıldığını açıklamaktadır.

## Proje Hakkında

Bu demo projesi, Math ve Presentation adında iki servisi içermektedir.

- **Math Servisi:** Matematiksel işlemleri gerçekleştiren bir servistir. İsteklere göre matematiksel işlem sonuçlarını döndürmektedir.

- **Presentation Servisi:** Math servisinin sonuçlarını alarak kullanıcı arayüzünde sunmaktadır. Bu servis, Feign Client kullanarak Math servisiyle iletişim kurmaktadır.

## Adımlar

1. **Spring Initializr Kullanarak Proje Oluşturma:** Bu adımda, Math servisini içeren ve kendi Controller'ına sahip olan bir Spring Boot projesi oluşturulur. Presentation servisi de aynı şekilde oluşturulur.

2. **Feign Client Kullanarak Servis İstemcisi Oluşturma:** Presentation servisinde, Feign Client kullanılarak Math servisiyle iletişim sağlanır. Bu şekilde, Presentation servisi Math servisi gibi davranır ve RESTful çağrıları daha kolay yönetilir hale gelir.

3. **Uygulama Sınıfı ve Controller'ların Yazılması:** Feign Client ile servis iletişimini yönetecek ve sonucu döndürecek olan Spring Boot uygulamasının sınıfları ve controller'ları yazılır.

## Nasıl Kullanılır?

1. Proje klonlanır veya indirilir.
2. Her iki servis de ayrı ayrı çalıştırılır. (Math ve Presentation servisleri)
3. Presentation servisinin çalıştırılması, Feign Client'in Math servisiyle iletişim kurmasını sağlar.
4. Presentation servisinin Controller'ı, Math servisinden gelen verileri kullanarak kullanıcı arayüzünde gösterir.

## Kaynaklar

- [Metin Alnıacık - Feign Client ve OpenFeign Kullanarak Servisler Arası İletişim Kurmak](https://metinalniacik.medium.com/feign-client-open-feign-kullanarak-servisler-aras%C4%B1-i%CC%87leti%C5%9Fim-kurmak-63d19a11b5c6)
- [Spring Initializr](https://start.spring.io/)
- [Spring Cloud OpenFeign Dokümantasyonu](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)

---

Bu README.md dosyası, Metin Alnıacık'ın "Feign Client ve OpenFeign Kullanarak Servisler Arası İletişim Kurmak" başlıklı makalesi temel alınarak oluşturulmuştur.
