if [ -z "$1" ]; then
   echo "Please specify which language_country suffix(es) you want to compile (e.g. en_US, fr, etc.)"
   exit 1
fi

mkdir -p target/classes > /dev/null 2>&1

for lang in $*
do
  echo "Compiling $lang to package com.khmerdev.i18nTranslateTest"
  msgfmt --verbose -f -r com.khmerdev.i18nTranslateTest.translations.messages --java2 -d target/classes \
         -l ${lang} msgs/${lang}.po
done
