def solution(str)
  str.chars.each_slice(2).map{|pair| pair[0] + (!!pair[1] ? pair[1] : '_')}
end