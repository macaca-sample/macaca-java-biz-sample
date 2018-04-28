# Bootstrap

---

基于Macaca-Java版的UI自动化实现demo

### 文档参考(从入门到精通)

[https://testerhome.com/junhe](https://testerhome.com/junhe)

### 安装Macaca环境

参考链接：(Macaca-Java版入门指南)[https://testerhome.com/topics/6431)

### 使用步骤

### 1. 下载源码

```bash
$ git clone https://github.com/macaca-sample/macaca-java-biz-sample.git
```

### 2. 更新依赖

```bash
$ cd macaca-java-biz-sample
$ make install
```

如果下载依赖过程中报错，可能是由于mvn -s命令没有生效导致的，建议将根目录下settings.xml中的依赖配置到本地Maven目录下的settings.xml中。

### 如何修改目标平台 ios/android?

```java
//package com.javademo.common;
// Config.java
// 目标平台- ios android

public static final String PLATFORM = "ios";
```
注意：执行iOS用例时需要将XCode升级到最新的8.1，执行用例前请先启动目标模拟器。

### 3. 启动server

```bash
$ macaca server --verbose
```

注意启动server时不能加代理，因为server在本机启动需要连接localhost,加代理会导致无法建立连接。

### 4. 执行测试用例

新建cmd窗口(记得新建cmd窗口哦，不要跟macaca server在同一个窗口执行) ，执行mvn test（默认为启动iOS用例）

```bash
$ mvn -s settings.xml test
```

或者选中SampleTest.java,右键执行run as -> JunitTest

### ReleaseNotes

#### v0.0.2

将原公共库代码common部分提出来单独建立了代码库，以jar包的形式上传至Jcenter，可通过Maven直接引用。

公共库代码也已开源: [//github.com/macaca-sample/macaca-java-biz-framework](//github.com/macaca-sample/macaca-java-biz-framework)

欢迎大家引用biz.jar，使用过程中遇到问题，可以提issue,我会尽快解决。

<!-- GITCONTRIBUTOR_START -->

## Contributors

|[<img src="https://avatars2.githubusercontent.com/u/5734727?v=4" width="100px;"/><br/><sub><b>Yinxl</b></sub>](https://github.com/Yinxl)<br/>|[<img src="https://avatars1.githubusercontent.com/u/1011681?v=4" width="100px;"/><br/><sub><b>xudafeng</b></sub>](https://github.com/xudafeng)<br/>
| :---: | :---: |


This project follows the git-contributor [spec](https://github.com/xudafeng/git-contributor), auto upated at `Sat Apr 28 2018 19:15:25 GMT+0800`.

<!-- GITCONTRIBUTOR_END -->
