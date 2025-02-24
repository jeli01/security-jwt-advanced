# security-jwt-advanced

application.properties에 있는 jwt 키는 바꾸길 바랍니다.

상용 서비스라면 깃허브에도 노출되면 안됩니다.

현재 Refresh 토큰을 DB에 저장하며 보안성을 높힙니다.

그런데 지금은 만료시간이 지난 토큰을 삭제하는 로직은 구현하지 않았습니다.

Schedule을 이용해 삭제하는 로직을 구현을 하거나 Redis TTL을 이용하는 방법을 선택해서 구현하세요