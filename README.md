// 初始化
git config --global user.name xxxxxx  (把xxxxxx替换成你的英文名字随便什么都行)
git config --global user.email yyyyyy  (把yyyyyy替换成你的邮箱跟github一致或者不一致也行)
git config --global push.default simple                                            
git config --global core.quotepath false  
git config --global core.editor "vim"   (使用vim编辑提交信息）

// 私钥和公钥
进入 https://github.com/settings/keys
如果页面里已经有一些 key，就点「delete」按钮把这些 key 全删掉。如果没有，就往下看
点击 New SSH key，你需要输入 Title 和 Key，但是你现在没有 key，往下看
打开 Git Bash,复制并运行 `rm -rf ~/.ssh/*`  把现有的 ssh key 都删掉，这句命令行如果你多打一个空格，可能就要重装系统了，建议复制运行。
运行 ssh-keygen -t rsa -b 4096 -C "你的邮箱"，注意填写你的邮箱！
按回车三次
运行 cat ~/.ssh/id_rsa.pub，得到一串东西，完整的复制这串东西
回到上面第 3 步的页面，在 Title 输入「我的第一个 key」
在 Key 里粘贴刚刚你你复制的那串东西
点击 Add SSH key
回到 Git Bash
运行 ssh -T git@github.com


cd git-demo-1
touch index2.html
git add index2.html
git commit -m "新建 index2.html"
git pull
git push
